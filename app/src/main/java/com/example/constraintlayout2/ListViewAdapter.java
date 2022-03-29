package com.example.constraintlayout2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;

    private ArrayList<ClassNama> arrayList;

    public ListViewAdapter(Context context) {

        mContext = context;
        inflater = LayoutInflater.from(mContext);

        this.arrayList = new ArrayList<ClassNama>();

        this.arrayList.addAll(HomeActivity.classNamaArrayList);


    }
    public class ViewHolder {
        TextView name;
    }
    @Override
    public int getCount() {
        //mengembalikan nilai berupa jumlah data dari array data
        return HomeActivity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return HomeActivity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null) {
            holder  = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(HomeActivity.classNamaArrayList.get(i).getName());

        return view;
    }
}
