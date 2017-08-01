package android.support.v4.animation;

import android.view.View;

interface AnimatorProvider {
    void clearInterpolator(View view) throws ;

    ValueAnimatorCompat emptyValueAnimator() throws ;
}
