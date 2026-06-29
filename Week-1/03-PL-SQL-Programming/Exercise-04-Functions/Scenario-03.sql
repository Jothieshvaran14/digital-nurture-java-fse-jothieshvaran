CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account NUMBER,
    p_amount NUMBER
)
RETURN BOOLEAN
IS
    balance NUMBER;
BEGIN
    SELECT Balance
    INTO balance
    FROM Accounts
    WHERE AccountID = p_account;

    RETURN balance >= p_amount;
END;
/