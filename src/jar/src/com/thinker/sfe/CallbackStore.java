package com.thinker.sfe;

import android.net.Uri;
import android.webkit.ValueCallback;

public interface CallbackStore {
    ValueCallback<Uri[]> filePathCallback();
    void setFilePathCallback(ValueCallback<Uri[]> cb);
}
