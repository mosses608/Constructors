package com.example.constructors.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constructors.Entity.Service;
import com.example.constructors.R;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder> {
    Context context;
    List<Service> services;

    public ServiceAdapter(Context context, List<Service> services) {
        this.context = context;
        this.services = services;
    }

    @NonNull
    @Override
    public ServiceAdapter.ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_projects, parent, false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceAdapter.ServiceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ServiceViewHolder extends RecyclerView.ViewHolder {
        ImageView projImage;
        TextView projName, constrName, consPhoneNo, time, location;
        public ServiceViewHolder(@NonNull View itemView) {
            super(itemView);

            projImage = itemView.findViewById(R.id.imageView5);
            projName = itemView.findViewById(R.id.projName);
            constrName = itemView.findViewById(R.id.ConsName);
            consPhoneNo = itemView.findViewById(R.id.phoneNo);
            time = itemView.findViewById(R.id.time);
            location = itemView.findViewById(R.id.location);
        }
    }
}
