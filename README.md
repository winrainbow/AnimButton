# AnimButton
为button drawableleft添加动画
## 最终实现的效果
![这里写图片描述](http://img.blog.csdn.net/20170713181722732?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2lucmFpbmJvdw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

 其中drawableleft是一个png图，上面的转圈的扇型是通过drawarc方法绘制的
 
## 实现方法 
- 1，为了解决drawableLeft与文字居中显示，使用了 iconButton <com.githang:com-phillipcalvin-iconbutton:2.0.2>
- 2，为了实现drawableLeft动画，重写了onDraw 方法，并实现了控制动画的接口 animController(boolean enableAnim);
