package me.eliascruz.jecpacktaller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.eliascruz.jecpacktaller.ui.theme.JecpackTallerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            }
        }
    }
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PcproductoScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.pc),
            contentDescription = "Producto",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Nombre del Producto", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "$99.99",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00C853)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "Descripción del producto con detalles importantes, características y beneficios.",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                "Editar",
                modifier = Modifier
                    .background(Color(0xFF6A1B9A))
                    .padding(12.dp),
                color = Color.White
            )

            Text(
                "Eliminar",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(12.dp),
                color = Color.White
            )
        }
    }
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ArticleScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Image(
            painter = painterResource(id = R.drawable.jecpack),
            contentDescription = "Portada",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI...",
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "In this tutorial, you build a simple UI component...",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.dexter),
            contentDescription = "Perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Juan Pérez", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            "Desarrollador Android apasionado por la tecnología y el diseño.",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontWeight = FontWeight.Bold)
                Text("Posts")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontWeight = FontWeight.Bold)
                Text("Seguidores")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontWeight = FontWeight.Bold)
                Text("Likes")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Seguir",
                modifier = Modifier
                    .background(Color(0xFF6A1B9A), shape = RoundedCornerShape(50))
                    .padding(horizontal = 24.dp, vertical = 8.dp),
                color = Color.White
            )

            Text(
                "Mensaje",
                modifier = Modifier
                    .background(Color.LightGray, shape = RoundedCornerShape(50))
                    .padding(horizontal = 24.dp, vertical = 8.dp)
            )
        }
    }
}
