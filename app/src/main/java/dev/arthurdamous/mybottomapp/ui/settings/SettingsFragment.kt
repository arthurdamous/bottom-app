package dev.arthurdamous.mybottomapp.ui.settings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.arthurdamous.mybottomapp.R
import dev.arthurdamous.mybottomapp.databinding.SettingsFragmentBinding
import dev.arthurdamous.mybottomapp.ui.settings.adapter.SettingsAdapter
import dev.arthurdamous.mybottomapp.ui.settings.model.SettingItem

class SettingsFragment : Fragment() {

    private var _binding: SettingsFragmentBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: SettingsViewModel
    private lateinit var settingsAdapter: SettingsAdapter

    private val settingsListItems = arrayListOf(
        SettingItem("Ethernet", R.drawable.ic_settings_ethernet),
        SettingItem("Appointments", R.drawable.ic_schedule),
        SettingItem("Logout", R.drawable.ic_exit),
        SettingItem("Ethernet", R.drawable.ic_settings_ethernet),
        SettingItem("Appointments", R.drawable.ic_schedule),
        SettingItem("Logout", R.drawable.ic_exit),
        SettingItem("Ethernet", R.drawable.ic_settings_ethernet),
        SettingItem("Appointments", R.drawable.ic_schedule),
        SettingItem("Logout", R.drawable.ic_exit),
        SettingItem("Ethernet", R.drawable.ic_settings_ethernet),
        SettingItem("Appointments", R.drawable.ic_schedule),
        SettingItem("Logout", R.drawable.ic_exit)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SettingsFragmentBinding.inflate(inflater, container, false)

        settingsAdapter = SettingsAdapter(settingsListItems)

        viewModel = ViewModelProvider(this)[SettingsViewModel::class.java]

        binding.rvSettings.apply {
            adapter = settingsAdapter
        }

        return binding.root
    }

}