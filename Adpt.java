package com.example.tops.recycleviewdemo1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tops on 7/20/2017.
 */

public class Adpt extends RecyclerView.Adapter <Adpt.myview>{

   private ArrayList<Listitem>listitems;
   private Context context;

    public Adpt(ArrayList<Listitem> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    @Override
    public Adpt.myview onCreateViewHolder(ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new myview(v);
    }

    @Override
    public void onBindViewHolder(Adpt.myview holder, int position) {
        Listitem listitem=listitems.get(position);

        holder.txtid.setText(listitem.getId());
        holder.txtfname.setText(listitem.getFname());
        holder.txtlname.setText(listitem.getLname());

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }
    public class myview extends RecyclerView.ViewHolder
    {
        TextView txtid,txtfname,txtlname;
        public myview(View itemView) {
            super(itemView);
            txtid=(TextView)itemView.findViewById(R.id.txtid) ;
            txtfname=(TextView)itemView.findViewById(R.id.txtfname) ;
            txtlname=(TextView)itemView.findViewById(R.id.txtlname) ;

        }
    }

}
