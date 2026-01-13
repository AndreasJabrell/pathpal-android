package se.jabrell.pathpal.ui.start

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun StartScreen(navController: NavHostController/*, mainViewModel: Any*/) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to PathPal")

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { navController.navigate("login")}) {
            Text("Admin login")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = {Toast.makeText(context, "User/butt clicked", Toast.LENGTH_SHORT).show()}) {
            Text("Join route")
        }
    }
}