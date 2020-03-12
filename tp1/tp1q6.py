# FIXME-begin
class Foo:
    i = 0
    def increment(self):
        self.i = self.i + 1
        return self
# FIXME-end

values = [Foo(),Foo(), Foo(), Foo()]
print([x.i for x in values])

values[0].increment()
values[0].increment()

tmp = [
    # FIXME-begin
    item.increment() for item in values
    # FIXME-end
]

print([x.i for x in tmp])
tmp[1].i = 12
print([x.i for x in values])
print([x.i for x in tmp])