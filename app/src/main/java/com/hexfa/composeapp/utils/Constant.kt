package com.hexfa.composeapp.utils

import com.hexfa.composeapp.R
import com.hexfa.composeapp.model.HomeCardItem
import com.hexfa.composeapp.model.Icon
import com.hexfa.composeapp.ui.components.icons.international_companies_icons.*
import com.hexfa.composeapp.ui.components.icons.iranian_compamies_icons.*

object Constant {
    private val internationalIcons = listOf(
        Icon(
            title = "Instagram",
            action = { InstagramIcon() },
            url = "https://www.instagram.com/hexfa"
        ),
        Icon(
            title = "Facebook",
            action = { FacebookIcon() },
            url = "https://www.facebook.com/"
        ),
        Icon(
            title = "Messenger",
            action = { MessengerIcon() },
            url = "https://messenger.com/"
        ),
        Icon(
            title = "Google",
            action = { GoogleIcon() },
            url = "https://www.google.com/"
        ),
        Icon(
            title = "Google Photo",
            action = { GooglePhotosIcon() },
            url = "https://photos.google.com/"
        ),
        Icon(
            title = "Youtube",
            action = { YoutubeIcon() },
            url = "https://www.youtube.com/"
        ),
        Icon(
            title = "Google Voice",
            action = { GoogleVoiceSearchIcon() },
            url = "https://voice.google.com/"
        ),
        Icon(
            title = "StackOverFlow",
            action = { StackOverFlowIcon() },
            url = "https://stackoverflow.com/"
        ),
        Icon(
            title = "Spotify",
            action = { SpotifyIcon() },
            url = "https://open.spotify.com/"
        ),
    )

    private val iranianIcons = listOf(
        Icon(
            title = "Snapp",
            action = { SnappIcon() },
            url = "https://snapp.ir/"
        ),
        Icon(
            title = "tapsi",
            action = { TapsiIcon() },
            url = "https://tapsi.ir/"
        ),
        Icon(
            title = "DigiKala",
            action = { DigikalaIcon() },
            url = "https://www.digikala.com/"
        ),
        Icon(
            title = "Anten",
            action = { AntenIcon() },
            url = "https://www.anten.ir/"
        ),
        Icon(
            title = "Cafe Bazaar",
            action = { CafeBazaarIcon() },
            url = "https://cafebazaar.ir/app?l=en"
        ),
    )

    val homeCards = listOf(
        HomeCardItem(
            headerTitle = "International",
            headerIconId = R.drawable.ic_international,
            items = internationalIcons,
        ),
        HomeCardItem(
            headerTitle = "Iranian",
            headerIconId = R.drawable.ic_iran,
            items = iranianIcons,
        )
    )
}