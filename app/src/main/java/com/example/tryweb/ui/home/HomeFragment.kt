package com.example.tryweb.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tryweb.R
import com.example.tryweb.WebViewController

class HomeFragment : Fragment() {

    private var homeViewModel: HomeViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val webView = root.findViewById<WebView>(R.id.web_view_home)
        webView.loadUrl("https://www.geeksforgeeks.org/")
        webView.webViewClient = WebViewController()
        return root
    }

}