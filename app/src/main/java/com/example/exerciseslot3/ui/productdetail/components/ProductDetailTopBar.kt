package com.example.exerciseslot3.ui.productdetail.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciseslot3.R
import com.example.exerciseslot3.ui.theme.DesignYellow
import com.example.exerciseslot3.ui.theme.DesignGray

@Composable
fun ProductDetailTopBar(onBackClick: () -> Unit) {
    Surface(color = DesignYellow) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 12.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black,
                    modifier = Modifier.clickable(onClick = onBackClick)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Back to Shop",
                    color = Color.Black,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = Icons.Filled.Create,
                    contentDescription = "Folder",
                    tint = DesignYellow
                )
            }

            BadgedBox(
                badge = {
                    Badge(containerColor = DesignGray) {
                        Text("3", color = Color.White, fontSize = 10.sp)
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    contentDescription = "Cart",
                    tint = Color.Black
                )
            }
        }
    }
}


