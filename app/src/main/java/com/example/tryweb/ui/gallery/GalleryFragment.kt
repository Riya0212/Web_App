package com.example.tryweb.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tryweb.R
import com.example.tryweb.WebViewController

class GalleryFragment : Fragment() {

    private var galleryViewModel: GalleryViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)
            val root = inflater.inflate(R.layout.fragment_gallery, container, false)
            val webView = root.findViewById<WebView>(R.id.web_view_practice)
            webView.loadUrl("https://www.google.co.in/")
            webView.webViewClient = WebViewController()
            return root
        }

    }


