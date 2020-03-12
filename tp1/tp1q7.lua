-- FIXME-begin
function powerize (value)
    local i = 0
    return function ()
        if i == 0 then
            i = i + 1
            return 1
        else
            local j = 1
            local val = value
            while j < i do
                val = val * value
                j = j + 1
            end
            i = i + 1
            return val
        end
    end
end
-- FIXME-end

c1 = powerize(1)
print(c1(), c1(), c1(), c1(), c1())
c2 = powerize(2)
print(c2(), c2(), c2(), c2(), c2())
c3 = powerize(3)
print(c3(), c3(), c3(), c3(), c3())