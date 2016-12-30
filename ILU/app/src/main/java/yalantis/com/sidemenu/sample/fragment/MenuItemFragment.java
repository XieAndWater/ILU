package yalantis.com.sidemenu.sample.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yalantis.com.sidemenu.sample.R;

/**
 * Created by Administrator on 2016/12/21.
 */
public class MenuItemFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu_fragment_layout, container, false);
        return rootView;
    }
}
