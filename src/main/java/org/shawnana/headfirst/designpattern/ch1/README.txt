策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户端。

在示例代码中，定义了两个算法族：FlyBehavior和QuackBehavior。
对于Duck类族，分别有两类变化的行为：Fly和Quack。如果将两种行为的默认实现放到Duck父类，将导致某些不能Fly和Quack的Duck子类
出现不应该有的行为；如果将两种行为提取为Flyable何Quackable接口，需要的Duck子类自行选择去实现接口的话，将导致代码大量重复
并且无法复用。因此选择使用策略模式解决。