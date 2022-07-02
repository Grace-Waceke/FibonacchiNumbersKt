package dev.waceke.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter(var  number_list:List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup,ViewType:Int):NumbersViewHolder{
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.number_lists_items,parent,false)
        return NumbersViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text=number_list.get(position).toString()
    }

    override fun getItemCount(): Int {
        return number_list.size
    }

}
class NumbersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
}