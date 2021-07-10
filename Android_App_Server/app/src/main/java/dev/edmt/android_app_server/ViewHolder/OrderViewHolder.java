package dev.edmt.android_app_server.ViewHolder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dev.edmt.android_app_server.Interface.ItemClickListener;
import dev.edmt.android_app_server.R;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit,btnRemove,btnDetail,btnDirection;


    public OrderViewHolder(@NonNull View itemView) {

        super(itemView);

        txtOrderAddress =(TextView)itemView.findViewById(R.id.order_address);
        txtOderId =(TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus =(TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone =(TextView)itemView.findViewById(R.id.order_phone);

        btnEdit= (Button)itemView.findViewById(R.id.btnEdit);
        btnDetail= (Button)itemView.findViewById(R.id.btnDetail);
        btnRemove= (Button)itemView.findViewById(R.id.btnRemove);
        btnDirection= (Button)itemView.findViewById(R.id.btnDirection);

    }


}
