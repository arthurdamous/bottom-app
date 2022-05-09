package dev.arthurdamous.mybottomapp.ui.settings.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.arthurdamous.mybottomapp.R
import dev.arthurdamous.mybottomapp.databinding.ItemSettingsBinding
import dev.arthurdamous.mybottomapp.ui.settings.model.SettingItem

class SettingsAdapter(
    private val items: ArrayList<SettingItem>
) : RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_settings, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.nameSettings.text = items[position].name
        holder.binding.nameIcon.setImageResource(items[position].resourceId)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: ItemSettingsBinding = ItemSettingsBinding.bind(itemView)


    }

}