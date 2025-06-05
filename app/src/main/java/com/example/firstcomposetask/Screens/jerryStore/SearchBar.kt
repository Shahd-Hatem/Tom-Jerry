package com.example.firstcomposetask.Screens.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposetask.R
import com.example.firstcomposetask.composable.SpacerHorizontal8
import com.example.firstcomposetask.ui.theme.Grey
import com.example.tomjerry.ui.theme.Ibm
import com.example.firstcomposetask.ui.theme.Primary

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(12.dp))
                .background(White)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_search),
                contentDescription = null
            )

            SpacerHorizontal8()

            Text(
                text = "Search about tom ...",
                color = Grey,
                fontFamily = Ibm,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        }

        SpacerHorizontal8()

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Primary),
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter),
                contentDescription = null
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SearchBarPreview() {
    SearchBar()
}