package com.example.exerciseslot3.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exerciseslot3.R
import com.example.exerciseslot3.ui.theme.DesignLightGray

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .border(1.dp, DesignLightGray, RoundedCornerShape(8.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        var query by remember { mutableStateOf("") }
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(start = 12.dp, top = 10.dp, bottom = 10.dp, end = 12.dp)
        ) {
            if (query.isEmpty()) {
                Text(
                    text = stringResource(id = R.string.search_hint),
                    color = Color.Gray
                )
            }
            BasicTextField(
                value = query,
                onValueChange = { query = it },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Search",
            tint = Color.Black,
            modifier = Modifier.padding(end = 12.dp)
        )
    }
}


