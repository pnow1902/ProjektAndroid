package com.example.navigationdrawerapapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.navigationdrawerapapplication.staff.*

class Staff : Fragment() , View.OnClickListener {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_staff, container, false)
        val owner: ImageButton = view.findViewById(R.id.staff_owner)
        owner.setOnClickListener(this)
        val generalManager: ImageButton = view.findViewById(R.id.staff_generalManager)
        generalManager.setOnClickListener(this)
        val coach: ImageButton = view.findViewById(R.id.staff_coach)
        coach.setOnClickListener(this)
        val assistantCoach: ImageButton = view.findViewById(R.id.staff_assistantCoach)
        assistantCoach.setOnClickListener(this)
        val fitnessCoach: ImageButton = view.findViewById(R.id.staff_fitnessCoach)
        fitnessCoach.setOnClickListener(this)
        val goalkeeperCoach: ImageButton = view.findViewById(R.id.staff_goalkeeperCoach)
        goalkeeperCoach.setOnClickListener(this)
        val physio: ImageButton = view.findViewById(R.id.staff_physio)
        physio.setOnClickListener(this)
        return view
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.staff_owner -> {
                val goTo = Intent(activity, Owner::class.java)
                startActivity(goTo)

            }
            R.id.staff_generalManager -> {
                val goTo = Intent(activity, GeneralManager::class.java)
                startActivity(goTo)

            }
            R.id.staff_coach -> {
                val goTo = Intent(activity, Coach::class.java)
                startActivity(goTo)

            }
            R.id.staff_assistantCoach -> {
                val goTo = Intent(activity, AssistantCoach::class.java)
                startActivity(goTo)

            }
            R.id.staff_fitnessCoach -> {
                val goTo = Intent(activity, FitnessCoach::class.java)
                startActivity(goTo)

            }
            R.id.staff_goalkeeperCoach -> {
                val goTo = Intent(activity, GoalkeeperCoach::class.java)
                startActivity(goTo)

            }
            R.id.staff_physio -> {
                val goTo = Intent(activity, Physio::class.java)
                startActivity(goTo)

            }

        }
    }
}