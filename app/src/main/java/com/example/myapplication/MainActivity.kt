package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import com.example.myapplication.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.onBackground) {
                    ImageView()
                }
            }
        }
    }
}

@Composable
fun ImageView() {
    val imagebanner: Painter = painterResource(id = R.drawable.omannn)
    val locationicon: Painter = painterResource(id = R.drawable.pin4)
    val userimage: Painter = painterResource(id = R.drawable.userphoto)
    val context = LocalContext.current
    val shape = RoundedCornerShape(12.dp)
    val CircleShape = RoundedCornerShape(50)
    Column(  verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.4f)
        )

        {
            Image(
                painter = painterResource(R.drawable.omannn),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
            Row(

                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(vertical = 25.dp, horizontal = 15.dp),
                verticalAlignment = Alignment.Bottom

            )
            {

                Image(
                    painter = locationicon,
                    contentDescription = "",
                    modifier = Modifier.padding(vertical = 10.dp)
                )

                Text(
                    text = "Oman, Musandam", fontSize = 22.sp,
                    modifier = Modifier.padding(vertical = 10.dp)
                )


            }


        }
        Row(


            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)

        )
        {
            Image(
                painter = userimage,
                contentDescription = "",
                contentScale = ContentScale.Crop,            // crop the image
                modifier = Modifier
                    .size(84.dp)
                    .padding(vertical = 1.dp, horizontal = 2.dp)
                    .clip(CircleShape)


            )


            Text(
                text = "Reham Albulushi", fontSize = 19.sp,
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
            Row(


                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(vertical = 25.dp)
                    .padding(start = 60.dp),

                verticalAlignment = Alignment.Top

            )
            {


                Image(
                    painter = painterResource(R.drawable.download),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(25.dp)
                        .padding(vertical = 1.dp, horizontal = 2.dp)
                        .clickable(
                            enabled = true,
                            onClickLabel = "Clickable image",
                            onClick = {
                                Toast
                                    .makeText(
                                        context,
                                        "Download button clicked",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )


                )
                Image(
                    painter = painterResource(R.drawable.heart),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(25.dp)
                        .padding(vertical = 1.dp, horizontal = 2.dp)
                        .clickable(
                            enabled = true,
                            onClickLabel = "Clickable image",
                            onClick = {
                                Toast
                                    .makeText(
                                        context,
                                        "Like button clicked",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )
                )
                Image(
                    painter = painterResource(R.drawable.bookmark),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(25.dp)
                        .padding(vertical = 1.dp, horizontal = 2.dp)
                        .clickable(
                            enabled = true,
                            onClickLabel = "Clickable image",
                            onClick = {
                                Toast
                                    .makeText(
                                        context,
                                        "Bookmark button clicked",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )
                )
            }

        }
        Divider(
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .width(2.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()

        )
        {
            Column {
                Row {
                    Column(
                        modifier = Modifier
                            .padding(all = 5.dp)
                    )
                    {

                        Text(
                            text = "Camera", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = "NIKON D3200", fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(all = 5.dp)
                )
                {
                    Text(
                        text = "Focal Length", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "18.0mm", fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(all = 5.dp)
                )
                {
                    Text(
                        text = "ISO", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "100", fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }

            Column(
                modifier = Modifier
                    .padding(end = 5.dp)
            )
            {


                Row {
                    Column(
                        modifier = Modifier
                            .padding(all = 5.dp)
                    )
                    {
                        Text(
                            text = "Aperture", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = "f/5.0", fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(all = 5.dp)
                )
                {
                    Text(
                        text = "Shutter Speed", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "1/125s", fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(all = 5.dp)
                )
                {
                    Text(
                        text = "Dimensions", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "3906 x 4882", fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }

        }
        Divider(
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .width(2.dp)
        )
        Row(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()

        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.33f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(text= "Views", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify, color = Color.White)
                Text(text= "8.8M", fontSize = 20.sp, textAlign = TextAlign.Justify, color = Color.White)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.53f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text= "Downloads", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, color = Color.White)
                Text(text= "99.1K", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color.White)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.73f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text= "Likes", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, color = Color.White)
                Text(text= "1.8K", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color.White)
            }

        }
        Divider(
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .width(2.dp)
        )
        Row(Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .clip(shape)
                    .background(Color(0xFFA2006D))
            )
            {
                Text( text = "Musandam", color = Color.White, fontSize = 20.sp,
                    modifier = Modifier
                        .padding(8.dp))
            }

            Box(
                modifier = Modifier
                    .clip(shape)
                    .background(Color(0xFFA2006D))
                    .padding(start = 4.dp)
            )
            {


                Text(
                    text = "Oman", color = Color.White, fontSize = 20.sp,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }

        }


    }
}

//@Composable
//fun TextCell(text: String, modifier: Modifier = Modifier) {
//
//    val cellModifier = Modifier
//
//
//    Text(text = text, cellModifier.then(modifier),
//        fontSize = 20.sp,
//       fontWeight = FontWeight.Bold,
//        textAlign = TextAlign.Left)
//}
//

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        ImageView()
    }
}