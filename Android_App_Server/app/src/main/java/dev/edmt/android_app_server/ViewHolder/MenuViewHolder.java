package dev.edmt.android_app_server.ViewHolder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dev.edmt.android_app_server.Common.Common;
import dev.edmt.android_app_server.Interface.ItemClickListener;
import dev.edmt.android_app_server.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener{

        public TextView txtMenuName;
        public ImageView imageView;

        private ItemClickListener itemClickListener;

        public MenuViewHolder(View itemView) {
            super(itemView);


            txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
            imageView = (ImageView)itemView.findViewById(R.id.menu_image);

            itemView.setOnCreateContextMenuListener(this);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;

        }
        @Override
        public void onClick(View view) {

            itemClickListener.onClick(view,getAdapterPosition(),false);
        }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");
        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,1,getAdapterPosition(), Common.DELETE);
    }
}


