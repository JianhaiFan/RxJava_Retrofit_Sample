package com.xiaofan.rrs;

import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import butterknife.OnClick;
import rx.Subscription;

/**
 * Created by fanjianhai on 2017/7/22.
 */

public abstract class BaseFragment extends Fragment {
    protected Subscription subscription;

    @OnClick(R.id.tipBt)
    void tip() {
        Log.e("fan","baseFragment...");
        new AlertDialog.Builder(getActivity())
                .setTitle(getTitleRes())
                .setView(getActivity().getLayoutInflater().inflate(getDialogRes(), null))
                .show();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unSubscribe();
    }

    protected void unSubscribe() {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    protected abstract int getDialogRes();

    protected abstract int getTitleRes();

}
