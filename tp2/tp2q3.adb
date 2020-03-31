with Ada.Text_IO; use Ada.Text_IO;

procedure Tp2q3 is

    -- FIXME-begin
    subtype Numerator is Integer range 100 .. 1000;
    subtype Denominator is Integer range 1 .. 10;
    subtype Result is Integer range 10 .. 1000;
    function DivBy(a : Numerator ; b : Denominator) return Result is
    begin
        return a / b;
    end DivBy;
    -- FIXME-end

begin
    Put_Line (Integer'Image(DivBy(200, 2)));
    -- Put_Line (Integer'Image(DivBy(2, 200))); -- "CONSTRAINT_ERROR : source.adb:19 range check failed"
end Tp2q3;