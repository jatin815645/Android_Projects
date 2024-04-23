package com.sunbeam.re_view.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.re_view.Models.RecipeModel;
import com.sunbeam.re_view.R;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder>
{

    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        RecipeModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Image", Toast.LENGTH_SHORT).show();
            }
        });

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked Text", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
