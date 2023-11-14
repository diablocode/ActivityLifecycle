package mx.udg.cucea.activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.udg.cucea.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : ComponentActivity() {
    private fun mensaje(mensaje: String){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mensaje("onCreate")
        setContent {
            ActivityLifecycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Lifecycle()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        mensaje("onStart")
    }

    override fun onResume() {
        super.onResume()
        mensaje("onResume")
    }

    override fun onPause() {
        super.onPause()
        mensaje("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        mensaje("onRestart")
    }

    override fun onStop() {
        super.onStop()
        mensaje("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        mensaje("onDestroy")
    }
}

@Composable
fun Lifecycle() {
    Text("Lifecycle")
}

@Preview(showBackground = true)
@Composable
fun LifeCyclePreview() {
    ActivityLifecycleTheme {
        Lifecycle()
    }
}