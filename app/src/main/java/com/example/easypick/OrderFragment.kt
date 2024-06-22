package com.example.easypick

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class OrderFragment : Fragment() {
    private lateinit var llDetail: LinearLayout
    private lateinit var svOrderList: ScrollView
    private lateinit var tvDetailName: TextView
    private lateinit var tvDetailLocation: TextView
    private lateinit var tvDetailHours: TextView
    private lateinit var ivDetailImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        llDetail = view.findViewById(R.id.llDetail)
        svOrderList = view.findViewById(R.id.svOrderList)
        tvDetailName = view.findViewById(R.id.tvDetailName)
        tvDetailLocation = view.findViewById(R.id.tvDetailLocation)
        tvDetailHours = view.findViewById(R.id.tvDetailHours)
        ivDetailImage = view.findViewById(R.id.ivDetailImage)

        val btnBackToList: Button = view.findViewById(R.id.btnBackToList)
        btnBackToList.setOnClickListener {
            llDetail.visibility = View.GONE
            svOrderList.visibility = View.VISIBLE
        }

        // Handle order item clicks
        setOrderItemClickListener(view, R.id.btnOrderCheck, "Ambrosia Restaurant", "kazi Deiry, Taiger Pass, Chittagong", R.drawable.resto1)
        setOrderItemClickListener(view, R.id.btnOrderCheck2, "Tava Restaurant", "Zakir Hossain Rd, Chittagong", R.drawable.resto1)
        setOrderItemClickListener(view, R.id.btnOrderCheck3, "Haatkhola", "6 Surson Road, Chittagong", R.drawable.resto1)

        return view
    }

    private fun setOrderItemClickListener(view: View, buttonId: Int, name: String, location: String, imageResId: Int) {
        val button: Button = view.findViewById(buttonId)
        button.setOnClickListener {
            showOrderDetails(name, location, imageResId)
        }
    }

    private fun showOrderDetails(name: String, location: String, imageResId: Int) {
        tvDetailName.text = name
        tvDetailLocation.text = location
        tvDetailHours.text = "Open today 10:00 AM - 12:00 PM"
        ivDetailImage.setImageResource(imageResId)

        llDetail.visibility = View.VISIBLE
        svOrderList.visibility = View.GONE
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OrderFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
