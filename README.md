# AnimButton
为button drawableleft添加动画
# 最终实现的效果
http://blog.csdn.net/winrainbow/article/details/75090095
# 实现方法 
- 1，为了解决drawableLeft与文字居中显示，使用了 iconButton <com.githang:com-phillipcalvin-iconbutton:2.0.2>
- 2，为了实现drawableLeft动画，重写了onDraw 方法，并实现了控制动画的接口 animController(boolean enableAnim);
