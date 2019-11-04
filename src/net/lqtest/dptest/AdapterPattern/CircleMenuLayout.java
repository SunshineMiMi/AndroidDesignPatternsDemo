package net.lqtest.dptest.AdapterPattern;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import net.lqtest.dptest.R;

/**
 * 自定义圆形菜单
 */
public class CircleMenuLayout extends ViewGroup {
	private Context mContext;
	// 圆圈直径
	private int mRadius;
	// 容器内child item的默认尺寸
	private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;
	// 容器内的内边距，无视padding属性，如需边距用该参数
	private static final float RADIO_PADDING_LAYOUT = 1 / 12f;
	private float mPadding;
	// 布局时的开始角度
	private double mStartAngle = 0;
	// 菜单项的文本
	private String[] mItemTexts;
	// 菜单项图标
	private int[] mItemImgs;
	// 菜单个数
	private int mMenuItemCount;
	// 菜单布局资源id
	private int mMenuItemLayoutId = R.layout.circle_menu_item;
	// MenuItem的点击事件
	private OnItemClickListener mOnMenuItemClickListener;

	public CircleMenuLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext = context;
		// 无视padding
		setPadding(0, 0, 0, 0);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {

	}

	public void setMenuItemIconsAndTexts(int[] imags, String[] texts) {
		if (imags == null || texts == null) {
			throw new IllegalArgumentException(mContext.getResources().getString(R.string.throw_text_circle_menu));
		}

		mItemImgs = imags;
		mItemTexts = texts;
		// 初始化menuCount
		mMenuItemCount = imags == null ? texts.length : imags.length;
		if (imags != null && texts != null) {
			mMenuItemCount = Math.min(imags.length, texts.length);
		}

		// 构建菜单项
		buildMenuItems();
	}

	private void buildMenuItems() {
		for (int i = 0; i < mMenuItemCount; i++) {
			View itemView = inflateMenuView(i);
			//初始化菜单项
			initMenuItem();
			//添加view到容器里
			addView(itemView);
		}
	}

	private void initMenuItem() {
		// TODO Auto-generated method stub
		
	}

	private View inflateMenuView(final int childIndex) {
		LayoutInflater mInflater = LayoutInflater.from(getContext());
		View itemView = mInflater.inflate(mMenuItemLayoutId, this, false);
		itemView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				if (mOnMenuItemClickListener != null) {
					mOnMenuItemClickListener.onItemClick(null, view, childIndex, 0);
				}
			}
		});
		return itemView;
	}

	public void setMenuItemLayoutId(int menuItemLayoutId) {
		this.mMenuItemLayoutId = menuItemLayoutId;
	}

	public void setOnItemClickListener(OnItemClickListener listener) {
		this.mOnMenuItemClickListener = listener;
	}
}
