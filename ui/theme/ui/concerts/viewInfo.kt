package com.angelaxd.lab62.ui.theme.ui.concerts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun viewInfo(navController: NavHostController){
    val scrollState= rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.verticalScroll(state = scrollState ) ){
        TopBar(navController);
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(30.dp) ){
            val texto1 = "Information";
            //val texto2 = "All concerts";
            Texto(texto1);
            CardInfo2("https://th.bing.com/th/id/R.208168e58a8e43c8decfec5f0f60658e?rik=LA444ARakvYaQA&riu=http%3a%2f%2frobertoramasso.com%2fcontrataciones%2forganizacion-de-eventos.jpg&ehk=HAgCeWZagGb5iCQucUVNH7RHnMmptQu2Y%2bsqf0IV3cQ%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1")

        }
    }
}

@Composable
fun CardInfo2(link: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable {},
        //elevation = 8.dp,
        shape = RoundedCornerShape(6.dp)
    ){
        Column() {
            //Image(painter = painterResource(
            //    id = R.drawable.ic_launcher_background), contentDescription = "imagen 1")

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(link)
                    //.transformations(CircleCropTransformation())
                    .transformations()
                    //.size(800,599)
                    .build(),

                contentDescription = null)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = "Title",
                //modifier = Modifier.fillMaxWidth(),
                //modifier = Modifier.wrapContentHeight(),
                fontSize = 15.sp,
                color = Color(0xFF6200EE),
                fontWeight= FontWeight.Bold, //grosor del texto
                fontStyle = FontStyle.Italic, //estilo (normal, cursiva..)
                lineHeight = 20.sp, //altura de linea del texto
                overflow = TextOverflow.Ellipsis //como se maneja el desbordamiento
            )
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetaur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.",
                fontSize = 10.sp,
                color = Color(0xFF6200EE),
                fontWeight = FontWeight.Bold, //grosor del texto
                fontStyle = FontStyle.Italic, //estilo (normal, cursiva..)
                lineHeight = 20.sp, //altura de linea del texto
                overflow = TextOverflow.Ellipsis //como se maneja el desbordamiento
            )
        }

    }


}