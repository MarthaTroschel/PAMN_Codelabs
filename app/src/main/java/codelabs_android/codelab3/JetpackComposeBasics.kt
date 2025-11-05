package codelabs_android.codelab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Codelab3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingApp()
        }
    }
}

@Composable
fun GreetingApp() {
    var text by remember { mutableStateOf("Hello Android!") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text, fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { text = "Bye Android" }) {
            Text("Click me")
        }
    }
}
