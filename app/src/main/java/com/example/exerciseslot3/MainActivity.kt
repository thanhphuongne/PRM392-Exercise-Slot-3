package com.example.exerciseslot3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exerciseslot3.ui.home.HomePage
import com.example.exerciseslot3.ui.productdetail.ProductDetailPage
import com.example.exerciseslot3.ui.theme.ExerciseSlot3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseSlot3Theme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomePage(onProductClick = { navController.navigate("product_detail") })
                    }
                    composable("product_detail") {
                        ProductDetailPage(onBackClick = { navController.popBackStack() })
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    ExerciseSlot3Theme { HomePage(onProductClick = {}) }
}