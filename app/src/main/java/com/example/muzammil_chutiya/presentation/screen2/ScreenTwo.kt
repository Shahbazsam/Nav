package com.example.muzammil_chutiya.presentation.screen2

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ScreenTwo(
    onGoBackClick : () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),

    ) {
        items(photoList){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(200.dp),
                    painter = painterResource(it.photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Text(
                    modifier = Modifier
                        .clickable(onClick = {onGoBackClick()}),
                    text = it.name
                )
            }
        }
    }
}