CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_amount NUMBER,
    p_rate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
    monthlyRate NUMBER;
    months NUMBER;
BEGIN
    monthlyRate := p_rate / 1200;
    months := p_years * 12;

    RETURN (p_amount * monthlyRate * POWER(1 + monthlyRate, months))
           / (POWER(1 + monthlyRate, months) - 1);
END;
/