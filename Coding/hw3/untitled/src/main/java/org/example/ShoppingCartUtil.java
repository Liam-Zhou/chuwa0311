package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
public class ShoppingCartUtil {
    private static final List<String> ALTERNATIVE_ITEMS = Arrays.asList("Apple", "Peach", "Grape");

    /**
     * 返回一个包含购物车中第一个商品名称的Optional<String> object
     * 如果客户或购物车信息缺失，或购物车为空，则返回一个空的Optional object
     */
    public static Optional<String> getFirstName(Customer customer) {
        //使用Optional.ofNullable()将customer object 转换成 Optional object
        return Optional.ofNullable(customer)
                // 使用map取得customer中的购物车信息
                .map(Customer::getShoppingCart)
                // 使用map取得购物车中的商品列表信息
                .map(ShoppingCart::getItems)
                // 使用filter过滤掉商品列表为空的情况
                .filter(items -> !items.isEmpty())
                // 使用map取得商品列表中的第一个商品对象
                .map(items -> items.get(0))
                // 使用map取得第一个商品对象的名称
                .map(Item::getName);
    }

    /**
     * 计算购物车中所有商品的总价，并返回该值
     */
    public static double getTotalPrice(Optional<Customer> customer) {
        //用map取得customer object中的购物车信息,如果customer为null，则返回空的Optional
        return customer.map(Customer::getShoppingCart)
                //用map取得购物车中的商品列表信息，如果购物车为null，则返回空的Optional
                .map(ShoppingCart::getItems)
                //用filter方法过滤掉商品列表为空的情况，确保商品列表不为空。
                .filter(items -> !items.isEmpty())
                //用map方法将商品列表转换成double类型的Stream，并用mapToDouble方法将每个商品的价格提取出，
                //然后用 sum 方法计算所有商品价格的总和。
                .map(items -> items.stream().mapToDouble(Item::getPrice).sum())
                //如果购物车为空或没有商品，则返回默认值 0.0
                .orElse(0.0);
    }
    /**
     * 假设我们想要获取客户购物车中的第一个商品名称，如果不存在，则从一个备选商品列表中随机选择一个商品名称作为默认值。
     */
    public static String getFirstItemNameWithAlternative(Customer customer) {
        //使用Optional.ofNullable()将customer object 转换成 Optional object
        return Optional.ofNullable(customer)
                .map(Customer::getShoppingCart)
                .map(ShoppingCart::getItems)
                .filter(items -> !items.isEmpty())
                .map(items -> items.get(0))
                .map(Item::getName)
                .orElseGet(ShoppingCartUtil::getRandomAlternativeItem);
    }

    /**
     * 假设我们想要获取客户购物车中的第一个商品名称，如果购物车为空或不存在，抛出一个自定义异常EmptyCartException。
     *
     * 在这个例子中，我们使用了orElseThrow()方法来处理当Optional对象为空时抛出EmptyCartException异常。
     * 这个方法将在客户或购物车信息缺失，或购物车为空的情况下被调用。
     */
    public static String getFirstItemNameOrThrowException(Customer customer) throws EmptyCartException {
        return Optional.ofNullable(customer)
                .map(Customer::getShoppingCart)
                .map(ShoppingCart::getItems)
                .filter(items -> !items.isEmpty())
                //Item("Apple", 1.50)
                .map(items -> items.get(0))
                .map(Item::getName)
                .orElseThrow(() -> new EmptyCartException("购物车为空或不存在"));
    }
    /**
     * 假设我们想要检查客户购物车中是否有商品，并打印相应的消息。
     *
     * 编写一个方法，接受一个Customer对象作为参数，然后使用isPresent()检查购物车中是否有商品，并打印相应的消息：
     *
     * 我们使用了isPresent()方法来检查Optional对象是否非空。我们首先从Customer对象中获取购物车商品列表，然后检查其是否为空。
     * 如果Optional对象非空且商品列表非空，我们打印“购物车中有商品”；否则，我们打印“购物车为空”。
     */
    public static void checkItemsInCart(Customer customer) {
        Optional<List<Item>> itemsOptional= Optional.ofNullable(customer)
                .map(Customer::getShoppingCart)
                .map(ShoppingCart::getItems);
        if (itemsOptional.isPresent() && !itemsOptional.get().isEmpty()) {
            System.out.println("购物车中有商品");
        } else {
            System.out.println("购物车为空");
        }
    }
    /**
     * 假设我们想要打印购物车中的所有商品名称，但只有在购物车中有商品时才执行此操作。
     *
     * 编写一个方法，接受一个Customer对象作为参数，然后使用ifPresent()处理购物车中的商品列表，并打印商品名称.
     *
     * 我们使用了ifPresent()方法来处理购物车中的商品列表。我们首先从Customer对象中获取购物车商品列表，
     * 然后使用ifPresent()在Optional对象非空的情况下执行操作。
     * 在这里，我们检查商品列表是否非空，然后打印购物车中的所有商品名称。
     */
    public static void printItemsInCart(Customer customer) {
        Optional<List<Item>> itemsOptional = Optional.ofNullable(customer)
                .map(Customer::getShoppingCart)
                .map(ShoppingCart::getItems);
        itemsOptional.ifPresent(items -> {
            if (!items.isEmpty()) {
                System.out.println("购物车中的商品：");
                items.forEach(item -> System.out.println(item.getName()));
            }
        });
    }
        private static String getRandomAlternativeItem() {
        Random r = new Random();
        int randomIndex = r.nextInt(ALTERNATIVE_ITEMS.size());
        return ALTERNATIVE_ITEMS.get(randomIndex);
    }


}
