package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;
import java.util.logging.Handler;

import id.my.donny.jualbelihp.R;
import id.my.donny.jualbelihp.model.Handphone;

public class ListAdapterHandphone extends BaseAdapter implements Filterable {
    private Context context
    private List<Handler> List, filtered;
    public ListAdapterHandphone(context, List<Handphone> List){
        this.context = context;
        this.List = List;
        this.filtered = this.List;
    }
    @Override
    public int getCount(){
        return filtered.size();
    }
    @Override
    public Object getItem(int position){
        return filtered.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView = null) {
            LayoutInflater inflater = LayoutInflater.from(this.context);
            convertView = inflater.inflate(R.layout.list_row, root:null);
        }
        Handphone hp = filtered.get(position);
        TextView textNama = (TextView) convertView.findViewById(R.id.text_nama);
        TextView textHarga = (TextView) convertView.findViewById(R.id.text_harga);
        textHarga.setText(hp.getHarga());
        return convertView;
    }
    @Override
    public Filter getFilter() {
        HandphoneFilter filter = new HandphoneFilter();
        return filter;
    }
    private class HandphoneFilter extents Filter {
        @Override
        protected FilterResult performFiltering(CharSequence constraint)
            List<Handphone> filterdData = new ArrayList<Handphone>();
            FilterResult result = new FilterResult();
            String filterString = constraint.toString().toLowerCase();
            for (Handphone hp:List) {
                if (hp.getNama().toLowerCase().contains(filterString)){
                    filterdData.add(hp);
                }
            }
            result.count = filteredData.size();
            result.values = filteredData;
            return result;
    }
    @Override
    protected void publishResult
}
