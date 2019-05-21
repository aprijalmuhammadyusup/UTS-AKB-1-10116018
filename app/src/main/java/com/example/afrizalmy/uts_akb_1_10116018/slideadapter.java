package com.example.afrizalmy.uts_akb_1_10116018;
//20Mei-10116018-Aprijal Muhammad Yusup-AKB1
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slideadapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
//list of images
    public int[] lst_images = {
            R.drawable.c,
            R.drawable.d,
            R.drawable.e

    };
//list of titles
    public String[] lst_title = {
        "PROFILE",
        "KONTAK",
        "DAFTAR TEMAN"
};
//list of descriptions
    public String[] lst_description = {
            "Description 1",
            "Description 2",
            "Description 3"
};

    //list of background color
    public int[] lst_backgroundcolor = {
            Color.rgb(55,55,55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49,89)

    };

    public slideadapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
