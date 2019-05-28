package com.example.funnyapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.os.Environment.getExternalStoragePublicDirectory;

public class Compartir extends AppCompatActivity {

    private ImageView mimageView;
    private static final int REQUEST_IMAGE_CAPTURE = 101;
    String currentImagePath = null;
    private static final int IMAGE_REQUEST = 1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir);
        mimageView = findViewById(R.id.imageView);
    }

    public void takePicture(View view)
    {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(imageTakeIntent.resolveActivity(getPackageManager()) != null)
        {
            File imageFile = null;

            try {
                imageFile = getImageFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

            if(imageFile!=null) {
                Uri imageUri = FileProvider.getUriForFile(this,"com.example.android.fileprovider",imageFile);
                imageTakeIntent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);

                startActivityForResult(imageTakeIntent,IMAGE_REQUEST);
            }
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if(requestCode==REQUEST_IMAGE_CAPTURE && resultCode==RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mimageView.setImageBitmap(imageBitmap);
        }

    }

    public void displayImage(View view)
    {
        Intent intent = new Intent(this, DisplayImage.class);
        intent.putExtra("image_path",currentImagePath);
        startActivity(intent);
    }

    private File getImageFile() throws IOException
    {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageName = "jpg "+timeStamp+"_";
        //File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File storageDir = getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);


        File imageFile = File.createTempFile(imageName,".jpg",storageDir);
        currentImagePath = imageFile.getAbsolutePath();
        return imageFile;
    }
}
