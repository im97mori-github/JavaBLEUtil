package org.im97mori.ble.characteristic.u2aa4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Bond Management Control Point (Characteristics UUID: 0x2AA4)
 */
public class BondManagementControlPoint implements ByteArrayInterface {

    /**
     * 1: Delete bond of requesting device (BR/EDR and LE)
     */
    public static final int OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_BR_EDR_LE = 1;

    /**
     * 2: Delete bond of requesting device (BR/EDR transport only)
     */
    public static final int OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_BR_EDR = 2;

    /**
     * 3: Delete bond of requesting device (LE transport only)
     */
    public static final int OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_LE = 3;

    /**
     * 4: Delete all bonds on server (BR/EDR and LE)
     */
    public static final int OP_CODE_DELETE_ALL_BONDS_ON_SERVER_BR_EDR_LE = 4;

    /**
     * 5: Delete all bonds on server (BR/EDR transport only)
     */
    public static final int OP_CODE_DELETE_ALL_BONDS_ON_SERVER_BR_EDR = 5;

    /**
     * 6: Delete all bonds on server (LE transport only)
     */
    public static final int OP_CODE_DELETE_ALL_BONDS_ON_SERVER_LE = 6;

    /**
     * 7: Delete all but the active bond on server (BR/EDR and LE)
     */
    public static final int OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_BR_EDR_LE = 7;

    /**
     * 8: Delete all but the active bond on server (BR/EDR transport only)
     */
    public static final int OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_BR_EDR = 8;

    /**
     * 9: Delete all but the active bond on server (LE transport only)
     */
    public static final int OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_LE = 9;

    /**
     * Op Code
     */
    private final int mOpCode;

    /**
     * Operand
     */
    private final String mOperand;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA4
     */
    public BondManagementControlPoint(@NonNull byte[] values) {
        mOpCode = (values[0] & 0xff);
        if (values.length > 1) {
            mOperand = new String(values, 1, values.length - 1);
        } else {
            mOperand = null;
        }
    }

    /**
     * @return Op Code
     */
    public int getOpCode() {
        return mOpCode;
    }

    /**
     * @return {@code true}:Delete bond of requesting device (BR/EDR and LE), {@code false}:not Delete bond of requesting device (BR/EDR and LE)
     */
    public boolean isOpCodeDeleteBondOfRequestingDeviceBrEdrLe() {
        return OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_BR_EDR_LE == mOpCode;
    }

    /**
     * @return {@code true}:Delete bond of requesting device (BR/EDR transport only), {@code false}:not Delete bond of requesting device (BR/EDR transport only)
     */
    public boolean isOpCodeDeleteBondOfRequestingDeviceBrEdr() {
        return OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_BR_EDR == mOpCode;
    }

    /**
     * @return {@code true}:Delete bond of requesting device (LE transport only), {@code false}:not Delete bond of requesting device (LE transport only)
     */
    public boolean isOpCodeDeleteBondOfRequestingDeviceLe() {
        return OP_CODE_DELETE_BOND_OF_REQUESTING_DEVICE_LE == mOpCode;
    }

    /**
     * @return {@code true}:Delete all bonds on server (BR/EDR and LE), {@code false}:not Delete all bonds on server (BR/EDR and LE)
     */
    public boolean isOpCodeDeleteAllBondsOnServerBrEdrLe() {
        return OP_CODE_DELETE_ALL_BONDS_ON_SERVER_BR_EDR_LE == mOpCode;
    }

    /**
     * @return {@code true}:Delete all bonds on server (BR/EDR transport only), {@code false}:not Delete all bonds on server (BR/EDR transport only)
     */
    public boolean isOpCodeDeleteAllBondsOnServerBrEdr() {
        return OP_CODE_DELETE_ALL_BONDS_ON_SERVER_BR_EDR == mOpCode;
    }

    /**
     * @return {@code true}:Delete all bonds on server (LE transport only), {@code false}:not Delete all bonds on server (LE transport only)
     */
    public boolean isOpCodeDeleteAllBondsOnServerLe() {
        return OP_CODE_DELETE_ALL_BONDS_ON_SERVER_LE == mOpCode;
    }

    /**
     * @return {@code true}:Delete all but the active bond on server (BR/EDR and LE), {@code false}:not Delete all but the active bond on server (BR/EDR and LE)
     */
    public boolean isOpCodeDeleteAllButTheActiveBondOnServerBrEdrLe() {
        return OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_BR_EDR_LE == mOpCode;
    }

    /**
     * @return {@code true}:Delete all but the active bond on server (BR/EDR transport only), {@code false}:not Delete all but the active bond on server (BR/EDR transport only)
     */
    public boolean isOpCodeDeleteAllButTheActiveBondOnServerBrEdr() {
        return OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_BR_EDR == mOpCode;
    }

    /**
     * @return {@code true}:Delete all but the active bond on server (LE transport only), {@code false}:not Delete all but the active bond on server (LE transport only)
     */
    public boolean isOpCodeDeleteAllButTheActiveBondOnServerLe() {
        return OP_CODE_DELETE_ALL_BUT_THE_ACTIVIE_BOND_ON_SERVER_LE == mOpCode;
    }

    /**
     * @return Operand
     */
    @Nullable
    public String getOperand() {
        return mOperand;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1 + (mOperand == null ? 0 : mOperand.length())];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mOpCode);
        if (mOperand != null) {
            byteBuffer.put(mOperand.getBytes());
        }
        return data;
    }

}
