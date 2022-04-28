package core.basesyntax.service.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import core.basesyntax.model.LineInformation;

public class BalanceState implements OperationHandler {

    @Override
    public boolean operation(LineInformation lineInformation) {
        String fruitName = lineInformation.getFruitName();
        int quantity = lineInformation.getQuantity();
        Storage.storage.put(new Fruit(fruitName), quantity);
        return true;
    }
}
