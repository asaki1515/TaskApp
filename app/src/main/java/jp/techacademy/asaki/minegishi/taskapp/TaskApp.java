package jp.techacademy.asaki.minegishi.taskapp;

import android.app.Application;

import io.realm.Realm;

// アプリ起動時に呼ばれるクラス
public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);  // Realmを初期化
    }
}