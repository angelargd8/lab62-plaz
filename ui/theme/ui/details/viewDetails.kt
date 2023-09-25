package com.angelaxd.lab62.ui.theme.ui.details

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.angelaxd.lab62.ui.theme.navegation.AppScreens
import com.angelaxd.lab62.ui.theme.ui.concerts.TopBar

//class viewDetails(navController: NavHostController) {
@Composable
fun viewDetails(navController: NavHostController){

    //columna principal
    val scrollState= rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .verticalScroll(state = scrollState)
        .padding(2.dp)  ){
        //funcion xd
        TopBar(navController);
        Caja();
        Texto();
        RowElementos();
        Textos();
        RowBotones()
        //BotonNav2(navController)

    }

}
/*
@Composable
fun BotonNav2(navController: NavHostController){
    Button(onClick = {
        /*TODO*/
        navController.navigate(route = AppScreens.viewFavorites.route)

    }, modifier= Modifier.padding(8.dp)) {
        Text("Navegar a details")
    }
}
*/

@Composable
fun Caja(){
    Box(modifier= Modifier
        .fillMaxWidth()
        .background(Color(0xC1D0B9F0))
        .height(350.dp)

    ){
        Column(modifier = Modifier.padding(top = 315.dp, bottom = 2.dp,start=10.dp)){
            Text(text = "Lugar:")
        }
    }
}
@Composable
fun Texto(){
    Text(
        text = "Title",
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        //modifier = Modifier.wrapContentHeight(),
        fontSize = 25.sp,
        color = Color(0xFF6200EE),
        fontWeight= FontWeight.Bold, //grosor del texto
        fontStyle = FontStyle.Italic, //estilo (normal, cursiva..)
        lineHeight = 17.sp, //altura de linea del texto
        overflow = TextOverflow.Ellipsis //como se maneja el desbordamiento
    )
}
@Composable
fun RowElementos(){
    Row(modifier = Modifier.padding(10.dp)){
        Imagen();
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Fecha")
        Spacer(modifier = Modifier.width(220.dp))
        Text(text = "Hora")
    }

}

@Composable
fun Imagen(){
    Image(
        painter = painterResource(id = R.drawable.ic_menu_agenda),
        contentDescription = "agenda",
        alignment = Alignment.BottomStart,
        modifier = Modifier
            .padding(3.dp)
            .width(40.dp)
            .height(40.dp),
        contentScale = ContentScale.Crop
    )
}


@Composable
fun Textos(){
    Text(text = "About", fontWeight= FontWeight.Bold, modifier = Modifier.fillMaxWidth())
    Text(text = "Lorem ipsum dolor sit amet, consectetaur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.")
}




@Composable
fun RowBotones(){
    Row(modifier = Modifier.padding(70.dp)) {
        Button(onClick = { /*TODO*/ }, modifier= Modifier.padding(8.dp)) {
            Text("favorite")
        }
        Spacer(modifier = Modifier.width(45.dp))

        Button(onClick = { /*TODO*/ }, modifier= Modifier.padding(8.dp)) {
            Text("Buy")
        }
    }
}
//}