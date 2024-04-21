package com.example.emergencylink.ui.theme.screens.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.ui.theme.EmergencyLinkTheme

fun LoginScreen(navController: NavHostController){

}
@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    EmergencyLinkTheme {
        LoginScreen(navController = rememberNavController())

    }
}