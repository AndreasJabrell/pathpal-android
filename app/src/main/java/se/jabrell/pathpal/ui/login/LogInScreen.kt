package se.jabrell.pathpal.ui.login

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun LogInScreen(navController: NavHostController/*, mainViewModel: Any*/) {
    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Please log in or create user")

        Spacer(modifier = Modifier.height(24.dp))

        //username AKA email input
        OutlinedTextField(
            value = username,
            singleLine = true,
            onValueChange = { username = it },
            label = { Text("Email") },
            //modifier = Modifier.fillMaxWidth(),



            )

        Spacer(modifier = Modifier.height(16.dp))

        //Password input
        OutlinedTextField(
            value = password,
            singleLine = true,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),

            //modifier = Modifier.fillMaxWidth()
        )

        Button(onClick = { Toast.makeText(context, "Username: $username\nPassword: $password (lol lätthackat)", Toast.LENGTH_SHORT).show()}) {
            Text("Admin login")
        }

        Spacer(modifier = Modifier.height(12.dp))

    }
}