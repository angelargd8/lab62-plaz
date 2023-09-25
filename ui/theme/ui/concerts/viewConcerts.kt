package com.angelaxd.lab62.ui.theme.ui.concerts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

//class viewConcerts(navController: NavHostController) {


@Composable
fun viewConcerts(navController: NavHostController){
    val scrollState= rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.verticalScroll(state = scrollState ) ){
        TopBar(navController);
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(30.dp) ){
            val texto1 = "Your Favorites";
            val texto2 = "All concerts";
            Texto(texto1);
            Row1(navController);
            Row2(navController);
            Texto(texto2);
            Row3(navController);
            //BotonNav(navController);
        }
    }

}

/*
@Composable
fun BotonNav(navController: NavHostController){
    Button(onClick = {
                     /*TODO*/
                     navController.navigate(route = AppScreens.viewDetails.route)

                     }, modifier= Modifier.padding(8.dp)) {
        Text("Navegar a details")
    }
}
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavHostController/*scope: CoroutineScope*/){

    TopAppBar(
        //title = { Text(text = "Todo Eventos" ) },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),

        navigationIcon = { IconButton(onClick = { navController.navigate(route = AppScreens.viewConcerts.route) })
                    {Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "goback")}
        },
        actions = {
            /*IconButton(onClick = { navController.navigate(route = AppScreens.viewConcerts.route)  }) {
                Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "goback")
            }*/
            IconButton(onClick = { navController.navigate(route = AppScreens.viewDetails.route)  }) {
                Icon(imageVector = Icons.Filled.DateRange, contentDescription = "call")
            }
            IconButton(onClick = { /*TODO*/ navController.navigate(route = AppScreens.viewFavorites.route) }) {
                Icon(imageVector = Icons.Filled.Call, contentDescription = "date")
            }
            IconButton(onClick = { /*TODO*/ navController.navigate(route = AppScreens.viewProfile.route) }) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "AccountCircle")
            }
        },
        title = { Text(text = "Todo Eventos" ) }

        
    )
}

@Composable
fun Texto(texto: String){

    Text(
        text = texto,
        modifier = Modifier.fillMaxWidth(),
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
fun Row1(navController: NavHostController){
    Row(){
        val link1 = "https://th.bing.com/th/id/R.52c1e68438f3a60b2590ea51f4f99172?rik=FsdgZEF9o3Pbvg&riu=http%3a%2f%2f2.bp.blogspot.com%2f--ecQDVZShi0%2fUlmxsxZy-wI%2fAAAAAAAAAmY%2fyTTFOFFkmJE%2fs1600%2feventos.jpg&ehk=KoLR%2blP0uByZcR986mvt7ga2C2Z7DggXUkbzS7K3plc%3d&risl=&pid=ImgRaw&r=0"
        val link2 = "https://image.freepik.com/vector-gratis/ilustracion-concepto-eventos_114360-988.jpg"
        CardInfo(navController,link1)
        CardInfo(navController,link2);
    }
}

@Composable
fun Row2(navController: NavHostController){
    Row(){
        val link1 = "https://th.bing.com/th/id/OIP.FCE0QSsDknTLDkOGqydX6gHaHa?pid=ImgDet&rs=1"
        val link2 = "https://thumbs.dreamstime.com/b/familiengenuss-zum-essen-oder-abendessen-mittagessen-tisch-familienfreundliches-mutter-vater-und-kind-zu-mittag-fr%C3%BChst%C3%BCck-160475857.jpg"
        CardInfo(navController,link1)
        CardInfo(navController,link2);
    }
}

@Composable
fun Row3(navController: NavHostController){
    Row(){
        val link1 = "https://static.vecteezy.com/system/resources/previews/002/100/545/large_2x/jazz-festival-concert-illustration-cartoon-flat-musician-characters-band-playing-jazz-music-at-live-concert-musician-playing-drum-violin-having-fun-with-music-hobbies-and-profession-vector.jpg"
        val link2 = "https://static.vecteezy.com/system/resources/previews/001/222/169/non_2x/musicians-playing-violins-clarinet-drum-vector.jpg"
        CardInfo(navController,link1)
        CardInfo(navController,link2);
    }
}




@Composable
fun CardInfo(navController: NavHostController, link: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable {navController.navigate(route = AppScreens.viewInfo.route) },
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
                    .size(399,399)
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
                text = "Suporting text",
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
//}