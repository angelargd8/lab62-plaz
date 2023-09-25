package com.angelaxd.lab62.ui.theme.ui.favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import com.angelaxd.lab62.ui.theme.navegation.AppScreens
import com.angelaxd.lab62.ui.theme.ui.concerts.TopBar

//class viewFavorites(navController: NavHostController) {

@Composable
fun viewFavorites(navController: NavHostController){
    //columna principal
    val scrollState= rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .verticalScroll(state = scrollState)
        .padding(8.dp)  ){
        //funcion xd
        TopBar(navController);
        Rowfun("Guns And Roses LAㅤㅤㅤㅤ","LA Hall");
        Rowfun("Guns And Roses Denverㅤ ","Denver Hall");
        Rowfun("Guns And Roses New York","Maddison Square Garden");
        //BotonNav3(navController)
    }

}

/*
@Composable
fun BotonNav3(navController: NavHostController){
    Button(onClick = {
        /*TODO*/
        navController.navigate(route = AppScreens.viewProfile.route)

    }, modifier= Modifier.padding(8.dp)) {
        Text("Navegar a profile")
    }
}
*/


@Composable
fun Rowfun(string1: String, string2:String){
    Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Start, modifier = Modifier
        .padding(8.dp)){
        Imagen("https://www.leadsourcing.co.in/images/user.png", 200, 200);
        Texto(string1, string2);
        Imagen("https://th.bing.com/th/id/R.44db2f77ec881db721ba62f4301951ea?rik=Ig0N5HY6LsUccQ&riu=http%3a%2f%2fcdn.onlinewebfonts.com%2fsvg%2fimg_93150.png&ehk=P1t%2fPGt3Ow97cmF3qJeSPcz%2f%2b8kRKjo%2bfPLq5yRUx0M%3d&risl=&pid=ImgRaw&r=0", 50,50);
    }


}

@Composable
fun Imagen(link: String,width: Int,height: Int){
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(link)
            //.transformations(CircleCropTransformation())
            .transformations()
            .size(width,height)
            .build(),

        contentDescription = null)
}

@Composable
fun Texto(string1: String, string2:String){
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = string1,
            fontSize = 20.sp,
            color = Color(0xFF6200EE),
            fontWeight= FontWeight.Bold, //grosor del texto
            fontStyle = FontStyle.Italic, //estilo (normal, cursiva..)
            lineHeight = 20.sp, //altura de linea del texto
            overflow = TextOverflow.Ellipsis //como se maneja el desbordamiento
        )
        Text(
            text = string2,
            fontSize = 15.sp,
            color = Color(0xFF6200EE),
            fontWeight= FontWeight.Normal, //grosor del texto
            fontStyle = FontStyle.Normal, //estilo (normal, cursiva..)
            lineHeight = 20.sp, //altura de linea del texto
            overflow = TextOverflow.Ellipsis //como se maneja el desbordamiento
        )
    }

}
//}