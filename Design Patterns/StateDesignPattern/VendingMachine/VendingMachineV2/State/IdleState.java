package StateDesignPattern.VendingMachine.VendingMachineV2.State;

import java.util.List;

import StateDesignPattern.VendingMachine.VendingMachineV2.Coin;
import StateDesignPattern.VendingMachine.VendingMachineV2.VendingMachine.VendingMachine;

public class IdleState implements VendingMachineState {

    @Override
    public void onSelectProductButtonPressed(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectProduct());
    }

    @Override
    public boolean readInputItemCode(VendingMachine vendingMachine, int itemCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readInputItemCode'");
    }

    @Override
    public void receivePayment(VendingMachine vendingMachine, int itemId, List<Coin> coins) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receivePayment'");
    }

    @Override
    public void onTransactionAbort(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onTransactionAbort'");
    }

    @Override
    public void onMakePaymentButtonPressed(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onMakePaymentButtonPressed'");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }
    
}
