package com.transsion.happyhour

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.transsion.file_preview.FilePreview

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(
                modifier = Modifier.fillMaxSize()
            ){
                FilePreview(
                    image = painterResource(id = R.drawable.alzheimers),
                    description = "Happy Hour",
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = "Alzheimers "
                )
            }
        }
    }
}