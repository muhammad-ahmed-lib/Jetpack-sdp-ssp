
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp



val Int.sdp: Dp
    @Composable
    get() = this.sdpGetSize()


val Int.ssp: TextUnit
    @Composable get() = this.sspGetTextUnit()


@Composable
fun Int.sdpGetSize(): Dp {
    val minValue = kotlin.math.min(getScreenHeight(), getScreenWidth())
    val ratio = minValue / 300.0
    return (this * ratio).dp
}

@Composable
fun Int.sspGetTextUnit(): TextUnit {
    return this.textSdpSize(density = LocalDensity.current)
}

@Composable
private fun Int.textSdpSize(density: Density): TextUnit = with(density) {
    this@textSdpSize.sdp.toSp()
}

@Composable
private fun getScreenHeight(): Int {
    val configuration = LocalConfiguration.current
    return configuration.screenHeightDp
}

@Composable
private fun getScreenWidth(): Int {
    val configuration = LocalConfiguration.current
    return configuration.screenWidthDp
}