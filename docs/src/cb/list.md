---
title: 列表控件
icon: /doc.svg
order: 4
category:
  - cb
  - MD
---

# 列表控件

## 一、下拉列表 Spinner

### 1.1 Spinner 控件

Spinner 控件是 Android 提供的一个下拉列表控件，用于在应用程序中显示一个可选择的列表，并允许用户从列表中选择一个选项。

Spinner 控件由两个主要部分组成：可展开的下拉箭头按钮和一个下拉列表。当用户点击下拉箭头按钮时，下拉列表会展开，显示可供选择的选项。当用户选择一个选项时，选择的值会显示在 Spinner 控件上方的文本框中。

Spinner 控件可以用于多种场景，例如：

1. 选择列表项：当应用程序需要用户从一个固定的列表中选择一个选项时，可以使用 Spinner 控件来展示列表并获取用户的选择。
2. 筛选或排序：在某些情况下，应用程序可能需要允许用户按照某个属性来筛选或排序数据。Spinner 控件可以用来显示可供选择的筛选或排序选项，并在用户进行选择后触发相应的操作。
3. 设置选项：如果应用程序具有一些可配置的选项，可以使用 Spinner 控件来提供一个界面，让用户选择合适的选项。

在使用 Spinner 控件时，需要为其提供一个适配器（Adapter），用于提供下拉列表中的数据。适配器通常使用 ArrayAdapter 或自定义适配器来提供数据，并将数据显示在下拉列表中。

通过编写适配器，可以将数据源（例如字符串数组或数据库查询结果）与 Spinner 控件关联起来，并控制列表项的显示方式。适配器还可以为列表项设置点击事件，以响应用户的选择。

### 使用 Spinner 的步骤

1. 在布局文件中添加列表控件，在 Java 代码文件中通过 id 属性获取到列表控件。
2. 准备数据源，数据源可以是数组或者集合。
3. 构建 Adapter 对象，指定列表中每一项数据的显示样式，并将数据源数据通过构造函数等方式传递给 Adapter 对象。
4. 列表控件调用哦个 setAdapter() 方法，关联创建好的 Adapter 对象，展示数据源中的数据。

### demo




### 1.2 Adapter 适配器

在 Android 中，Adapter（适配器）是一个关键的组件，用于将数据源与界面组件（如 ListView、GridView、RecyclerView、Spinner 等）进行绑定，以便显示数据并控制数据的交互。

适配器的主要作用是将数据源中的数据逐项地填充到界面组件中，并为每个数据项提供适当的布局和交互。适配器在数据源和界面组件之间充当了一个桥梁，使得数据能够正确地显示在界面上。

在 Android 中，常见的适配器类有以下几种：

1. ArrayAdapter：用于将数组或列表中的数据逐项填充到界面组件中。它可以将简单的文本或图像数据显示在界面上。
2. BaseAdapter：是一个抽象类，用于创建自定义的适配器。它提供了许多方法来处理数据源和界面组件之间的映射关系，包括数据项的数量、布局的创建、数据项的绑定等。
3. RecyclerView.Adapter：是用于 RecyclerView 组件的适配器类。它继承自 BaseAdapter，并提供了更灵活和高效的方式来处理数据项的显示和交互。

适配器的使用通常包括以下几个步骤：

1. 创建适配器对象：根据数据源的类型和界面组件的类型，选择合适的适配器类，并创建适配器对象。
2. 绑定数据源：将数据源与适配器关联，以便适配器可以获取数据源中的数据。
3. 创建界面布局：如果需要自定义数据项的显示方式，可以创建一个布局文件来定义数据项的布局。
4. 实现适配器的方法：根据适配器类的要求，实现适配器的方法，包括获取数据项数量、创建布局、绑定数据等。
5. 将适配器设置给界面组件：将适配器对象设置给界面组件，以便界面组件可以使用适配器来显示数据。

### 1.3 实战-收货地址



## 二、普通列表 ListView

### 2.1 ListView 控件

ListView 是 Android 平台上常用的一种界面组件，用于在垂直方向上显示可滚动的列表。它可以展示一个包含多个列表项的列表，并提供了一些常见的功能，如滚动、点击事件等。

ListView 的主要特点包括：

1. 垂直滚动：ListView 默认以垂直方向滚动，可以显示较长的列表内容，并支持滑动浏览。
2. 多个列表项：ListView 可以显示一个包含多个列表项的列表。每个列表项通常包含文本、图像或其他视图元素。
3. 适配器绑定：ListView 需要通过适配器（Adapter）来绑定数据源，并将数据逐项填充到列表项中。适配器负责管理数据和界面之间的映射关系。
4. 复用机制：为了提高性能，ListView 使用了复用机制。它只会创建足够数量的列表项来填充当前显示区域，当列表项滚出屏幕时，它会将其回收并复用于新的列表项。
5. 点击事件：ListView 提供了点击事件的支持，可以监听用户对列表项的点击操作，并执行相应的逻辑。

使用 ListView 的基本步骤如下：

1. 创建 ListView 对象：在布局文件或代码中创建一个 ListView 对象。
2. 创建适配器对象：根据数据源的类型和列表项的布局，创建一个适配器对象，并将其与 ListView 绑定。
3. 绑定适配器：将适配器对象设置给 ListView，以便将数据源中的数据逐项填充到列表项中。
4. 处理点击事件：为 ListView 设置点击事件监听器，以便响应用户对列表项的点击操作。

通过使用 ListView，可以方便地展示大量的数据，并提供滚动、点击等交互功能。它在许多 Android 应用程序中被广泛使用，如联系人列表、聊天记录等。

### 2.2 提升 ListView 运行效率



### 2.3 ListView 的单击事件



### 2.4 实战-订单中心



## 三、网格列表 GridView

### 3.1 GridView 控件

GridView 是 Android 平台上常用的一种界面组件，用于以网格形式展示可滚动的列表。它类似于 ListView，但是可以在水平和垂直方向上同时滚动，以显示多行多列的网格布局。

GridView 的主要特点包括：

1. 网格布局：GridView 以网格形式展示多个列表项，可以有多行多列的布局。每个列表项通常包含文本、图像或其他视图元素。
2. 适配器绑定：GridView 需要通过适配器（Adapter）来绑定数据源，并将数据逐项填充到列表项中。适配器负责管理数据和界面之间的映射关系。
3. 复用机制：为了提高性能，GridView 使用了复用机制。它只会创建足够数量的列表项来填充当前显示区域，当列表项滚出屏幕时，它会将其回收并复用于新的列表项。
4. 滚动：GridView 可以在水平和垂直方向上同时滚动，以适应较大的网格布局。
5. 点击事件：GridView 提供了点击事件的支持，可以监听用户对列表项的点击操作，并执行相应的逻辑。

使用 GridView 的基本步骤如下：

1. 创建 GridView 对象：在布局文件或代码中创建一个 GridView 对象。
2. 创建适配器对象：根据数据源的类型和列表项的布局，创建一个适配器对象，并将其与 GridView 绑定。
3. 绑定适配器：将适配器对象设置给 GridView，以便将数据源中的数据逐项填充到列表项中。
4. 处理点击事件：为 GridView 设置点击事件监听器，以便响应用户对列表项的点击操作。

通过使用 GridView，可以方便地展示多行多列的网格布局，并提供滚动、点击等交互功能。它在许多 Android 应用程序中被广泛使用，如图库、应用程序菜单等。

### 3.2 实战-首页商品列表



## 四、增强列表 RecyclerView

### 4.1 RecyclerView 控件

RecyclerView 是 Android 平台上更为灵活和高效的列表显示控件，它比传统的 ListView 和 GridView 更加强大。RecyclerView 提供了更多的自定义和扩展性，可以实现更复杂的列表布局和交互效果。

RecyclerView 的主要特点包括：

1. 布局管理器（LayoutManager）：RecyclerView 使用布局管理器来控制列表项的排列方式。它可以是线性布局（LinearLayoutManager）、网格布局（GridLayoutManager）或瀑布流布局（StaggeredGridLayoutManager）等。
2. 适配器（Adapter）：RecyclerView 使用适配器来绑定数据源，并将数据逐项填充到列表项中。与 ListView 和 GridView 不同的是，RecyclerView 的适配器需要继承自 RecyclerView.Adapter 类，并实现特定的方法。
3. 复用机制：与 ListView 和 GridView 类似，RecyclerView 也使用了复用机制来提高性能。它通过 ViewHolder 模式来复用列表项的视图，减少了创建和销毁视图的开销。
4. 动画支持：RecyclerView 内置了一些默认的动画效果，如添加和删除列表项时的动画效果。同时，开发者也可以自定义动画效果来满足特定的需求。
5. 点击事件：RecyclerView 提供了点击事件的支持，可以监听用户对列表项的点击操作，并执行相应的逻辑。与传统的 AdapterView 不同，RecyclerView 使用了自定义的 ItemClickListener 接口来处理点击事件。

使用 RecyclerView 的基本步骤如下：

1. 创建 RecyclerView 对象：在布局文件或代码中创建一个 RecyclerView 对象。
2. 设置布局管理器：根据需要选择合适的布局管理器，并将其设置给 RecyclerView。
3. 创建适配器对象：根据数据源的类型和列表项的布局，创建一个适配器对象，并将其与 RecyclerView 绑定。
4. 绑定适配器：将适配器对象设置给 RecyclerView，以便将数据源中的数据逐项填充到列表项中。
5. 处理点击事件：为 RecyclerView 设置 ItemClickListener 接口的实现，并处理列表项的点击事件。

通过使用 RecyclerView，开发者可以更加灵活地控制列表的布局和交互效果，提供更好的用户体验。它在许多 Android 应用程序中被广泛使用，如社交媒体的消息列表、新闻阅读应用的文章列表等。

### 4.2 RecyclerView 实现横向和网格布局



### 4.3 RecyclerView 实现单击实践



### 4.4 实战-产品列表
